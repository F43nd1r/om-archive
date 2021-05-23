
solution {
    puzzle = "P072"
    name = "NO-TRACK"
    arm(ARM1) {
        number = 1
        position = 2 to -4
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -4 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -6 to 1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -7 to 3
        rotation = 16
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -1 to 3
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to 5
        rotation = -11
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 3 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 3 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 5 to 5
        rotation = 5
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 12
        position = -2 to 2
        rotation = -8
        size = 1
    }
    arm(ARM3) {
        number = 13
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 14
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 15
        position = 4 to -2
        rotation = 9
        size = 1
    }
    arm(PISTON) {
        number = 16
        position = 4 to -5
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 17
        position = 5 to -3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 7 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 7 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 10 to 3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 7 to 8
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 10
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = 4 to -3
        rotation = 4
    }
    glyph(UNIFICATION) {
        position = -4 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 7
        rotation = -10
    }
    tape {
        parallel(
        {
            sequence(13) {
                wait(46)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(14)
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
                reset()
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
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(14) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(14)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                reset()
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
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(17) {
                wait(10)
                grab()
                extend()
                rotateClockwise()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(16) {
                wait(12)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
