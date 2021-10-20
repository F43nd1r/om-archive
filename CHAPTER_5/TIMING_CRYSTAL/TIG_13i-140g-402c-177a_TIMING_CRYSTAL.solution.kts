
solution {
    puzzle = "P042"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 3 to 1
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -4 to 1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -2 to -4
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to -5
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 0 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(17)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
