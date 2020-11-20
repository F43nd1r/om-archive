
solution {
    puzzle = "P101"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 5
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to 6
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 7
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 7
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -6 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -6 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -3 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -5 to 3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -4 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 2 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 3 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 2 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 1 to 3
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 17
        position = 1 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 18
        position = 1 to -1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 20
        position = 2 to -4
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 5
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
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
        position = -2 to 15
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 15
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -3 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 2, 0 to 1)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to -1, 0 to 0, 0 to 1)
    }
    track {
        position = 2 to -3
        positions = listOf(0 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = 3 to 2
        positions = listOf(-2 to 1, -1 to 0, 0 to 0, 1 to 0, 0 to 1, -1 to 1, -1 to 2, -1 to 3)
    }
    track {
        position = -7 to 3
        positions = listOf(1 to 0, 2 to 0, 3 to -1, 3 to 0, 3 to 1)
    }
    track {
        position = -5 to 5
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 1 to 2, 0 to 2, 0 to 1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(19) {
                wait(13)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(20) {
                wait(9)
                grab()
                forward()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
                wait(8)
                repeat()
                wait(15)
                grab()
                forward()
                drop()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateClockwise()
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
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
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
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                rotateClockwise()
                back()
                back()
                pivotClockwise()
                back()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                wait(5)
                back()
                back()
                wait(1)
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                wait(1)
                back()
                back()
                wait(1)
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                wait(1)
                back()
                back()
                wait(1)
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                wait(1)
                back()
                back()
                wait(1)
                forward()
                forward()
                wait(3)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(10)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(8)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(12)
                back()
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(2)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                grab()
                forward()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(3)
                repeat()
                wait(11)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                wait(2)
                forward()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(34)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(16)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                grab()
                forward()
                forward()
                drop()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                wait(3)
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
                wait(10)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(8)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                wait(6)
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(2)
                grab()
                retract()
                forward()
                drop()
                extend()
                grab()
                rotateClockwise()
                rotateClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                extend()
                wait(3)
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                grab()
                back()
                wait(1)
                forward()
                drop()
                rotateCounterClockwise()
                wait(4)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                reset()
                wait(2)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                reset()
                wait(2)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                reset()
                back()
                wait(1)
                reset()
            }
        }
        )
    }
}
