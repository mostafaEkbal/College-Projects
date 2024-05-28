from gtts import gTTS
from playsound import playsound
import speech_recognition as sr

r = sr.Recognizer()

with sr.Microphone() as src:
    print('Say something')
    audio = r.listen(src)

try:
    t = r.recognize_google_cloud(audio, language='ar-Ar')
    print(t)
    f = open('text.txt', 'a', encoding='UTF-8')
    f.writelines(t + '\n')
    f.close()
    obj = gTTS(text=t, lang='ar', slow=False)
    obj.save('text.mp3')
    playsound('text.mp3')

except sr.UnknownValueError as u:
    print(u)
except sr.RequestError as r:
    print(r)
