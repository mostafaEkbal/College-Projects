const convertFrom = document.getElementById('convert-from');
const convertTo = document.getElementById('convert-to');
const numberInput = document.getElementById('number-input');
const sumbit = document.getElementById('conversion-sumbit');
const output = document.getElementById('conversion-output');

function dataUnitsConversion(from, to, input) {
  let err = false;
  if (from.value === 'null' || to.value === 'null') {
    err = true;
    return 'the selection is empty';
  }
  if (!input.value) {
    err = true;
    return 'the input is empty';
  }
  if (from.value === to.value) {
    err = true;
    return 'select different units';
  }
  let result;

  if (from.value === 'bit' && to.value === 'byte') {
    result = input.value / 8;
  }
  if (from.value === 'bit' && to.value === 'kiloByte') {
    result = input.value / 8 / 2 ^ 10;
  }
  if (from.value === 'bit' && to.value === 'megaByte') {
    result = input.value / 8 / 2 ^ 20;
  }
  if (from.value === 'bit' && to.value === 'gigaByte') {
    result = input.value / 8 / 2 ^ 30;
  }

  if (from.value === 'byte' && to.value === 'bit') {
    result = input.value * 8;
  }
  if (from.value === 'byte' && to.value === 'kiloByte') {
    result = input.value / 2 ^ 10;
  }
  if (from.value === 'byte' && to.value === 'megaByte') {
    result = input.value / 2 ^ 20;
  }
  if (from.value === 'byte' && to.value === 'gigaByte') {
    result = input.value / 2 ^ 30;
  }
  if (from.value === 'bit' && to.value === 'byte') {
    result = input.value / 8;
  }

  if (from.value === 'kiloByte' && to.value === 'megaByte') {
    result = input.value / 2 ^ 10;
  }
  if (from.value === 'kiloByte' && to.value === 'gigaByte') {
    result = input.value / 2 ^ 20;
  }
  if (from.value === 'kiloByte' && to.value === 'byte') {
    ((result = input.value) * 2 ^ 10;
  }
  if (from.value === 'kiloByte' && to.value === 'bit') {
    result = input.value * 8 * 2 ^ 10;
  }

  if (from.value === 'megaByte' && to.value === 'kiloByte') {
    result = input.value * 2 ^ 10;
  }
  if (from.value === 'megaByte' && to.value === 'byte') {
    result = input.value * 2 ^ 20;
  }
  if (from.value === 'megaByte' && to.value === 'gigaByte') {
    result = input.value / 2 ^ 10;
  }
  if (from.value === 'megaByte' && to.value === 'bit') {
    ((result = input.value * 8) * 2 ^ 20;
  }

  if (from.value === 'gigaByte' && to.value === 'kiloByte') {
    result = input.value * 2 ^ 20;
  }
  if (from.value === 'gigaByte' && to.value === 'megaByte') {
    result = input.value * 2 ^ 10;
  }
  if (from.value === 'gigaByte' && to.value === 'byte') {
    result = input.value * 2 ^ 30;
  }
  if (from.value === 'gigaByte' && to.value === 'bit') {
    result = input.value * 8 * 2 ^ 30;
  }
  return `The result: ${input.value} ${from.value} = ${result} ${to.value} `;
}

sumbit.onclick = e => {
  e.preventDefault();
  const result = dataUnitsConversion(convertFrom, convertTo, numberInput);
  output.textContent = result;
  numberInput.value = '';
};
