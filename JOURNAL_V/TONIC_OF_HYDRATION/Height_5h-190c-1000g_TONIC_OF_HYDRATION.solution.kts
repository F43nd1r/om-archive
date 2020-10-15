
solution {
    puzzle = "P089"
    name = "H5 6T"
    arm(ARM6) {
        number = 1
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to 2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 2 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to 0
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 3 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -4 to 3
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -10 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -15 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -20 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = -14 to 3
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 13
        position = -18 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 14
        position = -20 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -19 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = -13 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 17
        position = -14 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -12 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = -12 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -16 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -17 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -15 to 2
        rotation = 9
    }
    glyph(DUPLICATION) {
        position = -12 to -1
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -18 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -19 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -17 to 3
        rotation = 0
    }
    track {
        position = 2 to 3
        positions = listOf(0 to -1, 0 to 0, 1 to -1)
    }
    track {
        position = 0 to -1
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0, 3 to 1, 3 to 2, 2 to 2, 2 to 1, 1 to 1, 1 to 2)
    }
    track {
        position = -6 to 4
        positions = listOf(1 to -1, 2 to -1)
    }
    track {
        position = -15 to -1
        positions = listOf(-5 to 1, -4 to 1, -3 to 1, -2 to 1, -1 to 1, 0 to 1, 0 to 2, 1 to 2, 2 to 2, 3 to 2, 4 to 2, 5 to 2, 5 to 3, 5 to 4)
    }
    track {
        position = -13 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -14 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1, -1 to -1)
    }
    track {
        position = -21 to 4
        positions = listOf(3 to -1, 3 to -2, 2 to -1, 1 to -1, 1 to -2, 1 to -3, 2 to -3)
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                forward()
                wait(4)
                forward()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(10)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                forward()
                wait(2)
                forward()
                forward()
                reset()
                wait(3)
                retract()
                retract()
                grab()
                pivotCounterClockwise()
                forward()
                reset()
                wait(13)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                extend()
                wait(7)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                extend()
                wait(7)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                extend()
                wait(7)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                extend()
                wait(7)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                extend()
                wait(7)
                forward()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                back()
                drop()
                forward()
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                wait(6)
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(13)
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                extend()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                rotateClockwise()
                extend()
                wait(2)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(19)
                grab()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                reset()
                wait(19)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(28)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                forward()
                retract()
                rotateCounterClockwise()
                reset()
                wait(14)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(4)
                forward()
                wait(1)
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(7)
                back()
                back()
                back()
                wait(4)
                forward()
                extend()
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(7)
                back()
                back()
                back()
                wait(4)
                forward()
                extend()
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(7)
                back()
                back()
                back()
                wait(4)
                forward()
                extend()
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(7)
                back()
                back()
                back()
                wait(4)
                forward()
                extend()
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(7)
                back()
                back()
                back()
                wait(4)
                forward()
                extend()
                grab()
                forward()
                forward()
                retract()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(9)
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                retract()
                retract()
                wait(7)
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                retract()
                wait(1)
                extend()
                rotateClockwise()
                retract()
                retract()
                wait(16)
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                retract()
                wait(1)
                extend()
                rotateClockwise()
                retract()
                retract()
                wait(16)
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                retract()
                wait(1)
                extend()
                rotateClockwise()
                retract()
                retract()
                wait(16)
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                retract()
                wait(1)
                extend()
                rotateClockwise()
                retract()
                retract()
                wait(16)
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                retract()
                wait(1)
                extend()
                rotateClockwise()
                retract()
                retract()
                wait(16)
                rotateCounterClockwise()
                extend()
                rotateCounterClockwise()
                wait(18)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                forward()
                forward()
                wait(9)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(5)
                grab()
                forward()
                forward()
                wait(10)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(10)
                grab()
                forward()
                forward()
                wait(10)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(10)
                grab()
                forward()
                forward()
                wait(10)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(10)
                grab()
                forward()
                forward()
                wait(10)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(10)
                grab()
                forward()
                forward()
                wait(10)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(14)
                forward()
                grab()
                retract()
                retract()
                forward()
                wait(5)
                forward()
                back()
                wait(3)
                back()
                back()
                extend()
                wait(2)
                forward()
                retract()
                forward()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(12)
                forward()
                back()
                wait(3)
                back()
                back()
                extend()
                wait(2)
                forward()
                retract()
                forward()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(12)
                forward()
                back()
                wait(3)
                back()
                back()
                extend()
                wait(2)
                forward()
                retract()
                forward()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(12)
                forward()
                back()
                wait(3)
                back()
                back()
                extend()
                wait(2)
                forward()
                retract()
                forward()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(12)
                forward()
                back()
                wait(3)
                back()
                back()
                extend()
                wait(2)
                forward()
                retract()
                forward()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(12)
                forward()
                wait(20)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                extend()
                extend()
                forward()
                drop()
                forward()
                retract()
                retract()
                wait(2)
                forward()
                grab()
                extend()
                extend()
                forward()
                reset()
                wait(13)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                pivotClockwise()
                back()
                extend()
                back()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                back()
                wait(3)
                grab()
                back()
                back()
                back()
                extend()
                pivotCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(3)
                forward()
                grab()
                forward()
                reset()
                wait(9)
                forward()
                grab()
                forward()
                reset()
                wait(6)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(11)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                back()
                reset()
                wait(8)
                grab()
                back()
                reset()
                wait(15)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        )
    }
}
