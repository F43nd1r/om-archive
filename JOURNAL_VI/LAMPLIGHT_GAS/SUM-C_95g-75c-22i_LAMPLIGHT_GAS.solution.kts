
solution {
    puzzle = "P092"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 6 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 7 to 1
        rotation = 1
        size = 3
    }
    glyph(CALCIFICATION) {
        position = 5 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to 4
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 7 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 3
        rotation = -1
    }
    track {
        position = 6 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 5 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotClockwise()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(10)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
