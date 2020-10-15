
solution {
    puzzle = "P092"
    name = "B II 1-6T"
    arm(ARM1) {
        number = 1
        position = 3 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 5 to 5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to 5
        rotation = -1
        size = 2
    }
    glyph(CALCIFICATION) {
        position = 7 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to 4
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 7 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 1
        rotation = 0
    }
    track {
        position = 3 to 4
        positions = listOf(0 to -1, 1 to -1, 0 to 0)
    }
    track {
        position = 4 to 5
        positions = listOf(0 to 0, 0 to -1, -1 to 0, -2 to 0, -2 to 1, -1 to 1)
    }
    track {
        position = 5 to 5
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                pivotCounterClockwise()
                forward()
                back()
                drop()
            }
        }
        )
    }
}
