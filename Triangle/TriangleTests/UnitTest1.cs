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
    }
}
