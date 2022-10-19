let array = [54, 26, 93, 17, 77, 31, 44, 55, 20];

const swap = (max, i) => {
  let temp = array[max];
  array[max] = array[i];
  array[i] = temp;
};

const selectionSort = array => {
  for (let i = array.length - 1; i > 0; i--) {
    let max = 0;
    for (let y = 0; y < i; y++) {
      if (array[y] > array[max]) {
        max = y;
      }
    }
    swap(max, i);
  }
  return array;
};

let arr = [1, 2, 3, 4, 5, 6];
selectionSort(array);
console.log(array);
