# Python program for implementation of heap Sort

# To heapify subtree rooted at index i.
# n is size of heap


def heapify(arr, N, i):
    largest = i  # Initialize largest as root
    l = 2 * i + 1     # left = 2*i + 1
    r = 2 * i + 2     # right = 2*i + 2

# See if left child of root exists and is
# greater than root
    if l < N and arr[largest][0] * arr[largest][1] < arr[l][0] * arr[l][1]:
        largest = l

# See if right child of root exists and is
# greater than root
    if r < N and arr[largest][0] * arr[largest][1] < arr[r][0] * arr[r][1]:
        largest = r

# Change root, if needed
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  # swap

    # Heapify the root.
        heapify(arr, N, largest)

# The main function to sort an array of given size


def heapSort(arr):
    N = len(arr)

# Build a maxheap.
    for i in range(N//2 - 1, -1, -1):
        heapify(arr, N, i)

# One by one extract elements
    for i in range(N-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # swap
        heapify(arr, i, 0)


# Driver's code
if __name__ == '__main__':
    arr = [(6, 8), (2, 4), (7, 1), (9, 2), (5, 7)]

# Function call
    heapSort(arr)
    N = len(arr)

    print("Sorted array is", str(arr))

    # This code is contributed by Mohit Kumra
