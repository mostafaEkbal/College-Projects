<main class="conversion">
    <h2>Conversion Tool</h2>
    <form class="conversion__form">
        <div class="conversion__units-container">
            <label class="conversion__label" for="convert-from">from:</label>
            <select name="convert-from" id="convert-from" class="conversion__select">
                <option value="null">...</option>
                <option value="bit" class="converion__option">Bit</option>
                <option value="byte" class="converion__option">Byte</option>
                <option value="kiloByte" class="converion__option">KiloByte</option>
                <option value="megaByte" class="converion__option">MegaByte</option>
                <option value="gigaByte" class="converion__option">GigaByte</option>
            </select>
        </div>
        <div class="conversion__units-container">
            <label class="conversion__label" for="convert-to">to:</label>
            <select name="convert-to" id="convert-to" class="conversion__select">
                <option value="null">...</option>
                <option value="bit" class="converion__option">Bit</option>
                <option value="byte" class="converion__option">Byte</option>
                <option value="kiloByte" class="converion__option">KiloByte</option>
                <option value="megaByte" class="converion__option">MegaByte</option>
                <option value="gigaByte" class="converion__option">GigaByte</option>
            </select>
        </div>
        <div class="conversion__input-container">
            <input type="number" placeholder="enter a value" id="number-input">
            <button type="submit" id="conversion-sumbit">convert</button>
        </div>
        <div class="conversion__output" id="conversion-output">

        </div>
    </form>
</main>