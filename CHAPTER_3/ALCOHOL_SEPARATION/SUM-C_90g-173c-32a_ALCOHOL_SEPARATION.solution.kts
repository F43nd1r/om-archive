
solution {
    puzzle = "P024"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 2 to 0
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = -2
        size = 2
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
