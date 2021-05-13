
solution {
    puzzle = "P043"
    name = "NO TRACK"
    arm(ARM1) {
        number = 1
        position = -11 to 4
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -10 to 4
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -7 to 1
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -5 to 2
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -3 to 4
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -10 to 0
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 2 to 4
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 8
        position = -5 to 4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 3 to 2
        rotation = 8
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -3 to 5
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 6 to -1
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 4
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 4
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 6 to -4
        rotation = 6
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -4 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 0 to 3
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 5 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 5 to -4
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 7 to -3
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 11 to -5
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 1 to 4
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -9 to 2
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 2
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -7 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -9 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 2 to 3
        rotation = 0
    }
    tape {
        parallel(
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
            sequence(2) {
                wait(2)
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
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(19)
                grab()
                pivotClockwise()
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
                wait(49)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
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
            sequence(9) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
