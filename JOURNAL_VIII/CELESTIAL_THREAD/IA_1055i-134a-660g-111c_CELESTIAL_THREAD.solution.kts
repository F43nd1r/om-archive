
solution {
    puzzle = "P101"
    name = "H4 6T"
    arm(ARM1) {
        number = 1
        position = -16 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -17 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -14 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -11 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -13 to 2
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -9 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -8 to 2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -7 to 2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -6 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -8 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -5 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -2 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 1 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 2 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -12 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -11 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -7 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -10 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -10 to 2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to 0
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 7 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to 2
        rotation = 0
    }
    track {
        position = -14 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 1, -2 to 1, -1 to 1)
    }
    track {
        position = -12 to 2
        positions = listOf(0 to 0, -1 to 0, 0 to -1, -1 to -1, -2 to -1)
    }
    track {
        position = -2 to 2
        positions = listOf(1 to 0, 0 to 0, 1 to -1, 0 to -1, -1 to -1, -2 to -1, -3 to -1, -4 to -1, -5 to -1, -6 to -1)
    }
    track {
        position = 3 to 2
        positions = listOf(3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(13)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
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
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
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
            sequence(7) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(15)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                back()
                wait(1)
                back()
                wait(1)
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(13)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(18)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                grab()
                back()
                wait(1)
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(28)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(45)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(13) {
                wait(40)
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                wait(4)
                reset()
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                back()
                back()
                back()
                back()
            }
        }
        )
    }
}
