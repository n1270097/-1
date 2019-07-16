public class IteratorSampleX {
public static void main(String[] args) {
// 20 個まで収納可能なゲームの容れ物を用意
BookList glist = new BookList(20);
//容れ物にゲームを入れる
glist.add(new Book("スーパーロケット対戦", 10800));
glist.add(new Book("サムライスピリチュアル", 7800));
glist.add(new Book("デイズゴローン", 5900));
//ゲームを取出して名称表示（本来は任意の位置から取り出し可能）
for (int i = 0; i < glist.getNumberOfStock(); i++) {
System.out.println( glist.getbook(i).getName());
}
}
}