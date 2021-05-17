
solution {
    puzzle = "P087"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = 1 to -4
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 2 to -6
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 3 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 5 to -4
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -4 to 4
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -5 to 6
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 7
        position = -6 to 5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -3 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -4 to 6
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to 4
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -3
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -5 to 5
        rotation = 0
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
            sequence(4) {
                wait(28)
                grab()
                pivotClockwise()
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
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(31)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
