
solution {
    puzzle = "P072"
    name = "NO-TRACK (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -1 to 5
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to 7
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -1 to 3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to 7
        rotation = 14
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 0 to 7
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 1 to 3
        rotation = -13
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 6 to 6
        rotation = 4
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 9
        position = -2 to 1
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 10
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 11
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 12
        position = 4 to -2
        rotation = 9
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = 4 to -5
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 14
        position = 5 to -3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = 9 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to 9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 7 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 11 to 3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 9 to 8
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 4 to 10
        rotation = 1
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
        position = -2 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 9
        rotation = -12
    }
    tape {
        parallel(
        {
            sequence(12) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
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
            sequence(13) {
                wait(5)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                rotateCounterClockwise()
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
            sequence(3) {
                wait(11)
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(45)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(51)
                grab()
                extend()
                wait(1)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(55)
                grab()
                rotateCounterClockwise()
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
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                extendTape()
            }
        }
        )
    }
}
