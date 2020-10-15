
solution {
    puzzle = "P024"
    name = "B GAX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 5
        size = 1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -5 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -4 to 1
        rotation = 0
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(11)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
