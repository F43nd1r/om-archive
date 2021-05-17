
solution {
    puzzle = "P087"
    name = "NO-TRACK (Copy)"
    arm(ARM6) {
        number = 1
        position = -4 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to -5
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = -8
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -8
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 5 to -5
        rotation = 6
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
        position = -4 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 1
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
        position = 9 to -4
        rotation = -10
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(34)
                grab()
                rotateClockwise()
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
            sequence(4) {
                wait(28)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(36)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(47)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
