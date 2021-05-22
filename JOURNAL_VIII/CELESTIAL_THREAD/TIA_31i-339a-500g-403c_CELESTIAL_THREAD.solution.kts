
solution {
    puzzle = "P101"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = -12
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to 2
        rotation = -9
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to 4
        rotation = -9
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -3 to 0
        rotation = -16
        size = 3
    }
    arm(ARM2) {
        number = 5
        position = -2 to 1
        rotation = -11
        size = 1
    }
    arm(ARM2) {
        number = 6
        position = -5 to -1
        rotation = -12
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -7 to 4
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -12 to 0
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -13 to 1
        rotation = -8
        size = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -12
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -5
    }
    glyph(BONDER) {
        position = -4 to 4
        rotation = -11
    }
    glyph(BONDER) {
        position = -8 to 3
        rotation = -11
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = -10
    }
    glyph(BONDER) {
        position = -10 to 0
        rotation = -10
    }
    glyph(BONDER) {
        position = -9 to -3
        rotation = -10
    }
    glyph(BONDER) {
        position = -8 to -3
        rotation = -10
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = -10
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = -9
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -13 to -1
        rotation = -7
    }
    glyph(UNBONDER) {
        position = -10 to -4
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -10 to -5
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -8 to -4
        rotation = -8
    }
    glyph(CALCIFICATION) {
        position = -9 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = -9
    }
    glyph(PROJECTION) {
        position = -1 to 2
        rotation = -9
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = -12
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = -11
    }
    io(INFINITE) {
        index = 0
        position = -26 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                retract()
                reset()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(109)
                grab()
                retract()
            }
        }
        )
    }
}
