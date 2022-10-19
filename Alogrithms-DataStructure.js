let list = [];
let size = 0;

const enqueue = a => {
  list.push(a);
  size++;
};

const dequeue = () => {
  if (isEmpty()) {
    return 'error, the list is empty';
  }
  const removedItem = list.shift();
  size--;
  return removedItem;
};

const isEmpty = () => {
  return size === 0;
};

const front = () => {
  if (isEmpty()) {
    return 'error, the list is empty';
  }
  return list[0];
};

enqueue(7);
console.log(list);
enqueue(5);
console.log(list);
enqueue(9);
console.log(list);
console.log(isEmpty());
console.log(list);
console.log(dequeue());
console.log(list);
console.log(front());
console.log(size);
console.log(dequeue());
console.log(list);
console.log(dequeue());
console.log(list);
console.log(front());
