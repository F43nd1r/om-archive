
solution {
    puzzle = "P067"
    name = "TI?"
    arm(ARM1) {
        number = 1
        position = 15 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 5 to 10
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 2 to 7
        rotation = 6
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 10 to 10
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 14 to 5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 14 to 3
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 11 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 4 to 2
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 4 to 1
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = 2 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = 2 to 1
        rotation = 3
        size = 1
    }
    arm(ARM2) {
        number = 12
        position = 4 to -6
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 8 to -8
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 5 to 13
        rotation = 2
    }
    glyph(BONDER) {
        position = 10 to -8
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 14 to 0
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to 13
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 9 to 10
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 15 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 13 to -6
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 8 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 10 to 9
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 11 to 4
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = -15 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 13
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 8 to 7
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(14)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(174)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(8) {
                wait(18)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(12)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
