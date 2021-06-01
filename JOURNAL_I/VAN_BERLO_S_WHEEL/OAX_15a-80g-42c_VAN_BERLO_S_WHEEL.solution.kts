
solution {
    puzzle = "P054"
    name = "OVERLAP AREA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
