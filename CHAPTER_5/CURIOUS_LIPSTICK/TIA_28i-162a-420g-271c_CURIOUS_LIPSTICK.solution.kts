
solution {
    puzzle = "P041"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -5 to -4
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -7 to -5
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 3 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 4 to 0
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 7
        position = 4 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 6 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to -5
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 0 to -4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to -3
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -2 to -4
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -1 to -5
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = 3 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -6 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(17)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
