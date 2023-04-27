<main class="conversion">
    <h2>Conversion Tool</h2>
    <form action="" class="conversion__form">
        <div class="conversion__units-container">
            <label class="conversion__label" for="convert-from">from:</label>
            <select name="convert-from" id="convert-from" class="conversion__select">
                <option value="null">Choose a unit...</option>
                <option value="bit" class="converion__option">Bit</option>
                <option value="byte" class="converion__option">Bytte</option>
                <option value="kiloByte" class="converion__option">KiloByte</option>
                <option value="megaByte" class="converion__option">MegaByte</option>
                <option value="gegaByte" class="converion__option">GegaByte</option>
            </select>
        </div>
        <div class="conversion__units-container">
            <label class="conversion__label" for="convert-to">to:</label>
            <select name="convert-to" id="convert-to" class="conversion__select">
                <option value="null">Choose a unit...</option>
                <option value="bit" class="converion__option">Bit</option>
                <option value="byte" class="converion__option">Bytte</option>
                <option value="kiloByte" class="converion__option">KiloByte</option>
                <option value="megaByte" class="converion__option">MegaByte</option>
                <option value="gegaByte" class="converion__option">GegaByte</option>
            </select>
        </div>
        <div class="conversion__input-container">
            <input type="number" placeholder="enter a value">
            <button type="submit">convert</button>
        </div>
        <div class="conversion__output">

        </div>
    </form>
</main>