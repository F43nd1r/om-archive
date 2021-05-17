
solution {
    puzzle = "P087"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -2 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -7
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 7
        position = 5 to -5
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -3
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
