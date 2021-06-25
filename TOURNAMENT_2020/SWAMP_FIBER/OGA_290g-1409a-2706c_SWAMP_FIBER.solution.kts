
solution {
    puzzle = "w2501727889"
    name = "B TI32GC 1-48T"
    arm(ARM6) {
        number = 1
        position = 2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to 6
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -20 to 2
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 4
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = -14 to -6
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -14
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -8 to -13
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 4
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to -1
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -31 to -14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -18 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -15 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -32 to -14
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
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
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
