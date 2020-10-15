
solution {
    puzzle = "P086"
    name = "H4 6T"
    arm(ARM1) {
        number = 1
        position = -18 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -18 to -1
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -17 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -15 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -12 to -3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -13 to -3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -15 to -2
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -14 to -2
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -10 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -15 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -14 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = 2 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 1 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 0 to -3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 15
        position = -1 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 16
        position = -2 to 0
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 17
        position = -4 to 0
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 18
        position = -8 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -12 to 0
        rotation = -6
    }
    glyph(BONDER) {
        position = -11 to -2
        rotation = -6
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -6
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = -6
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = -6
    }
    glyph(BONDER) {
        position = -13 to -1
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = -1 to -2
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = -16 to -1
        rotation = -11
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -19 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -19 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -18 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -20 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -16 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -16 to -3
        rotation = 0
    }
    track {
        position = -8 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -14 to 0
        positions = listOf(1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = -13 to -3
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 1, -1 to 1, 0 to 1, 1 to 1)
    }
    track {
        position = -1 to -3
        positions = listOf(2 to 1, 2 to 0, 3 to 0, 3 to 1)
    }
    track {
        position = -17 to -3
        positions = listOf(-1 to 1, 0 to 1, 0 to 2)
    }
    track {
        position = -8 to -3
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(17) {
                wait(5)
                grab()
                retract()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(4)
                pivotClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(5)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(16)
                repeat()
                wait(21)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(8)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(14)
                grab()
                forward()
                forward()
                back()
                back()
                extend()
                extend()
                retract()
                retract()
                reset()
                wait(8)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(9)
                forward()
                forward()
                wait(14)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                wait(1)
                back()
                wait(10)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(16)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                wait(2)
                extend()
                drop()
                back()
                reset()
                wait(4)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                retract()
                back()
                rotateClockwise()
                reset()
                wait(6)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                back()
                reset()
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                back()
                reset()
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                retract()
                drop()
                back()
                reset()
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                retract()
                wait(2)
                extend()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(12)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                drop()
                retract()
                grab()
                extend()
                rotateCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(13)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(13)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(13)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(12)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                reset()
                wait(11)
                extend()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                back()
                back()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                back()
                back()
                extend()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                retract()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                back()
                back()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                back()
                back()
                extend()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                retract()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                back()
                back()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                grab()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(11)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                grab()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                back()
                back()
                retract()
                retract()
                forward()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                reset()
                wait(11)
                grab()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
                wait(4)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                retract()
                wait(2)
                extend()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(10)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                grab()
                retract()
                wait(2)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                back()
                back()
                extend()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                retract()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                back()
                back()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                back()
                back()
                extend()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                wait(1)
                retract()
                wait(1)
                rotateCounterClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                retract()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                back()
                back()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                back()
                back()
                extend()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                rotateClockwise()
                retract()
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(7)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(7)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(15)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        )
    }
}
