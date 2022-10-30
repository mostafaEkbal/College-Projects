let array = [54, 26, 93, 17, 77, 31, 44, 55, 20];

const swap = (array = [], i = 0, j = 1) => {
  [array[i], array[j]] = [array[j], array[i]];
};

const maxHeapify = (array, i) => {
  const l = 2 * i;
  const r = 2 * i + 1;
  let largest;
  array[l] > array[r] ? (largest = l) : (largest = r);
  if (array[i] > array[l] && array[i] > array[r]) {
    return;
  }
  swap(array, i, largest);
};

const buildMaxHeap = array => {
  for (i = Math.floor(array.length / 2 - 1); i >= 1; i--) {
    maxHeapify(array, i);
  }
  return array;
};

buildMaxHeap(array);

console.log(array);
