
solution {
    puzzle = "P101"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -7 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -6 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -6 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -5 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -5 to -3
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -4 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -4 to -5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -2 to -7
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 1 to -8
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 1 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 2 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -1 to -5
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 16
        position = 0 to -5
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 17
        position = -4 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 18
        position = 1 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 19
        position = 0 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 20
        position = 0 to -2
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 21
        position = -3 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = -4 to 6
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to -4
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -3 to -5
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to -6
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -8 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -6
        rotation = 0
    }
    track {
        position = 1 to -6
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 2, 0 to 1)
    }
    track {
        position = 0 to -4
        positions = listOf(-1 to 0, -1 to -1, 0 to -1, 0 to 0, 0 to 1, 0 to 2, 0 to 3, 1 to 2, 2 to 2, 1 to 3, 2 to 3)
    }
    track {
        position = 1 to -7
        positions = listOf(0 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -2, 0 to -1)
    }
    track {
        position = -4 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 1 to 2, 0 to 2, 0 to 1)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 1)
    }
    track {
        position = -3 to 11
        positions = listOf(4 to -2, 4 to -3, 4 to -4, 3 to -3, 3 to -4, 3 to -5, 2 to -4, 1 to -4, 0 to -3, 0 to -4, 0 to -5)
    }
    tape {
        parallel(
        {
            sequence(15) {
                wait(5)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(4)
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
                wait(3)
                forward()
                reset()
                wait(1)
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
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                back()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(12) {
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
                wait(6)
                grab()
                rotateClockwise()
                forward()
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
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
                grab()
                forward()
                back()
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
                back()
                grab()
                back()
                back()
                back()
                reset()
                wait(2)
                forward()
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
                back()
                reset()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
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
            sequence(10) {
                wait(2)
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
                reset()
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
            sequence(22) {
                wait(72)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(2)
                grab()
                retract()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                retract()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                drop()
                extend()
                wait(8)
                grab()
                retract()
                drop()
                extend()
                wait(8)
                grab()
                retract()
                drop()
                extend()
                wait(7)
                back()
                wait(4)
                grab()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                wait(2)
                grab()
                forward()
                drop()
                wait(2)
                rotateClockwise()
                extend()
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
                forward()
                forward()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                forward()
                wait(6)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                forward()
                wait(6)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                forward()
                wait(6)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                forward()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(21) {
                wait(23)
                grab()
                back()
                back()
                wait(4)
                forward()
                forward()
                retract()
                retract()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                extend()
                extend()
                retract()
                retract()
                back()
                back()
                wait(5)
                extend()
                extend()
                wait(1)
                retract()
                retract()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                wait(2)
                forward()
                forward()
                back()
                back()
                drop()
                extend()
                extend()
                wait(2)
                forward()
                forward()
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(8)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(1)
                back()
                wait(5)
                grab()
                forward()
                extend()
                drop()
                back()
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
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                extend()
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
                retract()
                wait(7)
                back()
                forward()
                grab()
                back()
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
                wait(4)
                forward()
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
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(10)
                grab()
                forward()
                drop()
                retract()
                wait(5)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(30)
                extend()
                back()
                grab()
                retract()
                drop()
                wait(2)
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                forward()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(6)
                forward()
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                wait(17)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(14)
                grab()
                forward()
                rotateClockwise()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                retract()
                rotateClockwise()
                wait(1)
                back()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(20) {
                wait(6)
                back()
                wait(2)
                grab()
                rotateClockwise()
                retract()
                drop()
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
                wait(1)
                back()
                wait(1)
                rotateCounterClockwise()
                forward()
                wait(4)
                reset()
            }
        }
        )
    }
}
