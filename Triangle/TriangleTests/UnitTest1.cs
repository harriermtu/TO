using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace TriangleTests
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod_IsRightAngled()
        {
            //wszystkie kombinacje na tak
            Triangle trg = new Triangle(3, 4, 5);
            Assert.AreEqual(true, trg.IsRightAngled());
            trg = new Triangle(4, 5, 3);
            Assert.AreEqual(true, trg.IsRightAngled());
            trg = new Triangle(5, 3, 4);
            Assert.AreEqual(true, trg.IsRightAngled());

            //wszystkie kombinacje na nie
            trg = new Triangle(6, 8, 13);
            Assert.AreEqual(false, trg.IsRightAngled());
            trg = new Triangle(8, 13, 6);
            Assert.AreEqual(false, trg.IsRightAngled());
            trg = new Triangle(13, 6, 8);
            Assert.AreEqual(false, trg.IsRightAngled());
        }

        [TestMethod]
        public void TestMethod_IsScalene() {
            //roznoboczny, wszystkie kombinacje
            Triangle trg = new Triangle(3, 4, 5);
            Assert.AreEqual(true, trg.IsScalene());
            trg = new Triangle(4, 5, 3);
            Assert.AreEqual(true, trg.IsScalene());
            trg = new Triangle(5, 3, 4);
            Assert.AreEqual(true, trg.IsScalene());

            //rownoramienny, wszystkie kombinacje
            trg = new Triangle(3, 3, 5);
            Assert.AreEqual(false, trg.IsScalene());
            trg = new Triangle(3, 5, 3);
            Assert.AreEqual(false, trg.IsScalene());
            trg = new Triangle(5, 3, 3);
            Assert.AreEqual(false, trg.IsScalene());

            //rownoboczny
            trg = new Triangle(4, 4, 4);
            Assert.AreEqual(false, trg.IsScalene());
        
        }

        [TestMethod]
        public void TestMethod_IsIsosceles()
        {
            //te same testy co do scalene, tyle ze wartosciowanie na odwrot
            //powinno znalezc blad przy rownobocznym (tez jest rownoramienny)
            //roznoboczny, wszystkie kombinacje
            Triangle trg = new Triangle(3, 4, 5);
            Assert.AreEqual(false, trg.IsIsosceles());
            trg = new Triangle(4, 5, 3);
            Assert.AreEqual(false, trg.IsIsosceles());
            trg = new Triangle(5, 3, 4);
            Assert.AreEqual(false, trg.IsIsosceles());

            //rownoramienny, wszystkie kombinacje
            trg = new Triangle(3, 3, 5);
            Assert.AreEqual(true, trg.IsIsosceles());
            trg = new Triangle(3, 5, 3);
            Assert.AreEqual(true, trg.IsIsosceles());
            trg = new Triangle(5, 3, 3);
            Assert.AreEqual(true, trg.IsIsosceles());

            //rownoboczny
            trg = new Triangle(4, 4, 4);
            //rownoboczny to tez rownoramienny
            Assert.AreEqual(true, trg.IsIsosceles());

        }

        [TestMethod]
        public void TestMethod_IsEquilateral()
        {
            //jest rownoboczny ale nie jest trojkatem
            Triangle trg = new Triangle(0, 0, 0);
            Assert.AreEqual(false, trg.IsEquilateral());

            //nie jest rownoboczny, wszystkie kombinacje (wszystkie boki rowne, 2 boki rowne)
            //roznoboczny, wszystkie kombinacje
            trg = new Triangle(3, 4, 5);
            Assert.AreEqual(false, trg.IsEquilateral());
            trg = new Triangle(4, 5, 3);
            Assert.AreEqual(false, trg.IsEquilateral());
            trg = new Triangle(5, 3, 4);
            Assert.AreEqual(false, trg.IsEquilateral());
            //rownoramienny, wszystkie kombinacje
            trg = new Triangle(3, 3, 5);
            Assert.AreEqual(false, trg.IsEquilateral());
            trg = new Triangle(3, 5, 3);
            Assert.AreEqual(false, trg.IsEquilateral());
            trg = new Triangle(5, 3, 3);
            Assert.AreEqual(false, trg.IsEquilateral());
            //rownoboczny
            trg = new Triangle(5, 5, 5);
            Assert.AreEqual(true, trg.IsEquilateral());

        }
    }
}
