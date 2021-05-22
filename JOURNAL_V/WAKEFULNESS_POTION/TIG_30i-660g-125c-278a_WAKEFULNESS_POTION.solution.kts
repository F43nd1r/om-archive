
solution {
    puzzle = "P088"
    name = "NO-TRACK"
    arm(ARM3) {
        number = 1
        position = -8 to 6
        rotation = -8
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -9 to 3
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -5 to 2
        rotation = -4
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -7 to 6
        rotation = -7
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -10 to 3
        rotation = -11
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = -13 to 2
        rotation = -6
        size = 2
    }
    arm(ARM3) {
        number = 7
        position = -14 to 6
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 8
        position = 1 to 4
        rotation = -8
        size = 1
    }
    glyph(BONDER) {
        position = -10 to 4
        rotation = -6
    }
    glyph(BONDER) {
        position = -11 to 6
        rotation = -6
    }
    glyph(BONDER) {
        position = -9 to 5
        rotation = -6
    }
    glyph(BONDER) {
        position = -10 to 7
        rotation = -4
    }
    glyph(BONDER) {
        position = -13 to 6
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -13 to 5
        rotation = -8
    }
    glyph(CALCIFICATION) {
        position = -6 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -13 to 11
        rotation = -12
    }
    glyph(DUPLICATION) {
        position = -10 to 13
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = -4 to 8
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = -3 to 5
        rotation = -10
    }
    glyph(DUPLICATION) {
        position = -3 to 8
        rotation = -13
    }
    glyph(DUPLICATION) {
        position = -12 to 9
        rotation = -12
    }
    glyph(DUPLICATION) {
        position = -12 to 10
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = -9 to 11
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = -2 to 9
        rotation = -12
    }
    glyph(DUPLICATION) {
        position = 4 to 6
        rotation = -12
    }
    glyph(DUPLICATION) {
        position = 6 to 1
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = 7 to 2
        rotation = -9
    }
    glyph(DISPOSAL) {
        position = -15 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -18
    }
    io(INPUT) {
        index = 1
        position = -11 to 2
        rotation = -24
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
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
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
