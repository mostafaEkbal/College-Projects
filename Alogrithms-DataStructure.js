let array = [54, 26, 93, 17, 77, 31, 44, 55, 20, 69, 88, 99];

const swap = (array = [], i = 0, j = 1) => {
  [array[i], array[j]] = [array[j], array[i]];
};

const shiftDown = (array, i) => {
  const arrayInternalNodes = Math.floor(array.length / 2);
  if (i * 2 > arrayInternalNodes) {
    maxHeapify(array, i);
    return array;
  }
  maxHeapify(array, i);
  for (let j = 2 * i; j <= 2 * i + 1; j++) {
    maxHeapify(array, j);
  }
};

const maxHeapify = (array, i) => {
  const l = 2 * i - 1;
  const r = 2 * i;
  const index = i - 1;
  let largest = index;
  if (array[index] < array[l]) {
    largest = l;
  }
  if (array[largest] < array[r]) {
    largest = r;
  }
  if (largest === index) {
    return array;
  }
  swap(array, index, largest);
  if (r <= Math.floor(array.length / 2)) {
    return shiftDown(array, i);
  }
  return array;
};

const buildMaxHeap = array => {
  for (let i = Math.floor(array.length / 2); i >= 1; i--) {
    shiftDown(array, i);
  }
  return array;
};

const heapSort = array => {
  buildMaxHeap(array);
  for (let i = array.length - 1; i > 0; i--) {
    swap(array, i, 0);
    shiftDown(array, i);
  }
};
