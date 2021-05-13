
solution {
    puzzle = "P043"
    name = "NO TRACK"
    arm(ARM1) {
        number = 1
        position = -8 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -7 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to -1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to 0
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 0 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to 1
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 4 to 4
        rotation = -3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 8
        position = -2 to 2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 6 to 0
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 0 to 3
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 9 to -3
        rotation = -9
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 7 to -3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 6 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 9 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to -8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 11 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 12 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 13 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to -4
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = 8 to -6
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 10 to -5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 14 to -7
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 4 to 3
        rotation = -4
    }
    glyph(ANIMISMUS) {
        position = -6 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 0
        rotation = -12
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 5 to 3
        rotation = 0
    }
    tape {
        parallel(
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
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(11) {
                wait(82)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
