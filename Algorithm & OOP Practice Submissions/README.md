# 🚀 Algorithm & OOP Practice Submissions

Энэ репод LeetCode болон Beecrowd платформуудын Java дээр бодож гүйцэтгэсэн дунд болон ахисан түвшний бодлогууд байрлана. Бодлого бүрт инкапсуляци, анги (`class`), болон даалгаврын шаардлагад нийцсэн шийдлийг ашигласан.

---

## 🟩 1. [LeetCode: Design Parking System](https://leetcode.com/problems/design-parking-system/)

### ✅ Бодлогын тайлбар (монгол):
`ParkingSystem` гэсэн класс үүсгэнэ. Конструктор нь том, дунд, жижиг машины орон тоо авч хадгална. `addCar(carType)` функц нь тухайн төрлийн машин орж болох эсэхийг шалгаж, `true`/`false` буцаана.

| Машины төрөл | carType утга |
|--------------|---------------|
| Big          | 1             |
| Medium       | 2             |
| Small        | 3             |

### 🛠 Ашигласан class:
```java
class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}
