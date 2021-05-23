
solution {
    puzzle = "P072"
    name = "NO-TRACK (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -4 to 5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 7
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to 3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to 6
        rotation = 14
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to 8
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 5 to -2
        rotation = -10
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 3 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 3 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 5 to 5
        rotation = 5
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 11
        position = -2 to 1
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 12
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 13
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 14
        position = 4 to -2
        rotation = 9
        size = 1
    }
    arm(PISTON) {
        number = 15
        position = 4 to -5
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 16
        position = 5 to -3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 9
        rotation = -1
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
        position = 11 to 3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 7 to 7
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 10
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 4 to -4
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = -3 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 7
        rotation = -13
    }
    tape {
        parallel(
        {
            sequence(14) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(3)
                grab()
                extend()
                rotateClockwise()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(45)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(50)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(50)
                grab()
                retract()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(52)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                rotateCounterClockwise()
            }
        }
        )
    }
}
