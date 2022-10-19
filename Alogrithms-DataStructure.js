let array = [54, 26, 93, 17, 77, 31, 44, 55, 20];

const swap = y => {
  let temp = array[y];
  array[y] = array[y + 1];
  array[y + 1] = temp;
};

const bubbleSort = array => {
  for (let i = array.length - 1; i > 0; i--) {
    let swapped = false;
    for (let y = 0; y < i; y++) {
      if (array[y] > array[y + 1]) {
        swap(y);
        swapped = true;
      }
    }
    if (!swapped) break;
  }
  return array;
};

let arr = [1, 2, 3, 4, 5, 6];
bubbleSort(arr);
console.log(arr);
