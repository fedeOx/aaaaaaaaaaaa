class SetSuite extends FunSuite {
	test ("An empty Set should have size 0") {
		assert(Set.empty.size == 0)
	}	

	test (" Calling head on an empty Set should yield
		NoSuchElementException ") {
			assertThrows[NoSuchElementException] {
			Set.empty.head
		}
	}
}