
solution {
    puzzle = "P104"
    name = "NO-TRACK (Copy)"
    arm(ARM1) {
        number = 1
        position = -6 to 3
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -2 to 0
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -5 to 2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 2 to 0
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 0 to 1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -2 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to -4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 3 to 2
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 1 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 4
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                extend()
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
                drop()
                retract()
                retract()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                retract()
                drop()
                extend()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                extend()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                grab()
                extend()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
