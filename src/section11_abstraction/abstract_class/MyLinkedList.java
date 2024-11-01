package section11_abstraction.abstract_class;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {  // Если есть в списке, возвр false
                return false;
            } else if (comparison > 0){
                //currentItem больше, вставить item нужно перед currentItem
                item.setNext(currentItem);
                if (currentItem.previous() != null) {
                    item.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(item);
                } else {
                    this.root = item;
                }
                currentItem.setPrevious(item);
                return true;
            } else if (currentItem.next() == null) {  // Вставка в конец
                currentItem.setNext(item);
                item.setPrevious(currentItem);
                return true;
            }
            currentItem = currentItem.next();
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // System.out.println("Deleting item "+ item.getValue());
        if (this.root == null) {
            return false;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    // Если удаляем корень, устанавливаем новый корень
                    if (currentItem.next() != null){
                        this.root = currentItem.next();
                        this.root.setPrevious(null);
                    } else {
                        this.root = null;
                    }
                } else {
                    if (currentItem.next() != null) {
                        // Устанавливаем ссылку на следующий элемент для предыдущего элемента
                        currentItem.previous().setNext(currentItem.next());
                        // Устанавливаем ссылку на предыдущий элемент для следующего элемента
                        currentItem.next().setPrevious(currentItem.previous());
                    } else {
                        currentItem.previous().setNext(null);
                    }
                }
                return true;
            }
            currentItem = currentItem.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}