
solution {
    puzzle = "P039"
    name = "H4 6T"
    arm(PISTON) {
        number = 1
        position = -8 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -8 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -8 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -6 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -7 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -4 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -3 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -3 to 1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = -1 to 1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 12
        position = -1 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 13
        position = 0 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = -8 to 0
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -8 to 1
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = -6 to 2
        positions = listOf(3 to -1, 4 to -1, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(2)
                back()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(13)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                back()
                wait(1)
                rotateClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(13)
                back()
                rotateClockwise()
                wait(2)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                drop()
                retract()
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                back()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                extend()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(13)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                back()
                back()
                drop()
                forward()
                wait(2)
                reset()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                back()
                wait(1)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
