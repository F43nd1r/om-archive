
solution {
    puzzle = "P054"
    name = "NO-TRACK"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to 3
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
