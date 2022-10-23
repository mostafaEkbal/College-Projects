let array = [54, 26, 93, 17, 77, 31, 44, 55, 20];

const swap = (max, i) => {
  let temp = array[max];
  array[max] = array[i];
  array[i] = temp;
};

const insertionSort = array => {
  for (let i = 1; i < array.length; i++) {
    let position = 0;
    while (array[i - 1 - position] > array[i - position]) {
      let temp = array[i - 1 - position];
      array[i - 1 - position] = array[i - position];
      array[i - position] = temp;
      position++;
    }
  }
  return array;
};

insertionSort(sortedArray);

console.log(sortedArray);
