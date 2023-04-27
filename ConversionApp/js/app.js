const convertFrom = document.getElementById('convert-from');
const convertTo = document.getElementById('convert-to');
const numberInput = document.getElementById('number-input');
const output = document.getElementById('conversion-input');

function dataUnitsConversion(from, to, input) {
  if (from.value !== 'null' && to.value !== 'null') return;
  if (!input.value) return;
  let result;
  if (from.value === 'bit' && to.value === 'byte') {
    result = input / 8;
  }
  if (from.value === 'bit' && to.value === 'kiloByte') {
    result = ((input / 8) * 2) ^ -10;
  }
  if (from.value === 'bit' && to.value === 'megaByte') {
    result = ((input / 8) * 2) ^ -20;
  }
  if (from.value === 'bit' && to.value === 'gigaByte') {
    result = ((input / 8) * 2) ^ -30;
  }
}
