
solution {
    puzzle = "P034"
    name = "NO-TRACK I-22"
    arm(ARM6) {
        number = 1
        position = -4 to 0
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -2 to -1
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -3 to -7
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to -7
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 6 to -5
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = 5 to -4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = 8 to -4
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 8 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(18)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                extendTape()
                wait(3)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        )
    }
}
