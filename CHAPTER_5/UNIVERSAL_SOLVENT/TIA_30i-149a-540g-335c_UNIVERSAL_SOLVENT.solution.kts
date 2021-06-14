
solution {
    puzzle = "P043"
    name = "B TI30 1-6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 2 to -2
        rotation = -5
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -6 to 0
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 3 to 2
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -1 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -7 to 2
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -4 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -10 to 5
        rotation = 11
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -7 to 6
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -7 to 5
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -9 to 8
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -13 to 8
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -13 to 5
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -11 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -15 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -14 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -14 to 7
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to -2
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -11 to 7
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -15 to 9
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -12 to 9
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -5 to 0
        rotation = 4
    }
    glyph(ANIMISMUS) {
        position = 2 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 0 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to 2
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -6 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
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
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(12)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                rotateCounterClockwise()
                wait(6)
                extendTape()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
