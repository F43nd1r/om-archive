
solution {
    puzzle = "P043"
    name = "TI (Copy)"
    arm(ARM6) {
        number = 1
        position = -11 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -10 to -6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -13 to -5
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -9 to -3
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -12 to -1
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to -5
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -4 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -6 to -8
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 0 to -8
        rotation = 8
        size = 3
    }
    glyph(BONDER) {
        position = -10 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to -9
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -8
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -11
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -11
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -8
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -6 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -12
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -10
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to -2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -11 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to -10
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 5 to -12
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to -12
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -5 to -3
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -12 to -5
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -10 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -5
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -13 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -12 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -4 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
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
            sequence(7) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                rotateCounterClockwise()
            }
        }
        )
    }
}
