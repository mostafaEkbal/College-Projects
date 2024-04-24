import csv

f = open("ObesityDataSet_raw_and_data_sinthetic.csv")

csv_f = csv.reader(f)

for row in csv_f:
    print(row[3])

f.close()