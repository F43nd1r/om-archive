
solution {
    puzzle = "P024"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -2 to -1
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
