
solution {
    puzzle = "P062"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -3 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -5 to 1
        rotation = 12
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -4
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -1 to -19
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -2 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -4 to 2
        rotation = 12
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 2 to -14
        rotation = 8
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -23
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -15
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to -10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -10 to -12
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 2, -1 to 3, -2 to 3, -3 to 4, -2 to 4, -1 to 4, -2 to 5)
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 4 to -1
        positions = listOf(0 to -9, 0 to -8, 0 to -7, 0 to -6, 0 to -5, 0 to -4, -1 to -3, -2 to -3, -2 to -2, -2 to -1, -1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 1, -3 to 2)
    }
    track {
        position = -1 to -22
        positions = listOf(0 to -1, 0 to 0, 0 to 1, 0 to 2, 0 to 3)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(59)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                grab()
                back()
                reset()
                back()
                wait(1)
                forward()
                wait(3)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(4)
                forward()
                grab()
                back()
                back()
                back()
                reset()
                wait(2)
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                forward()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                drop()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
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
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(49)
                grab()
                back()
                back()
                back()
                back()
                drop()
                wait(12)
                reset()
            }
        }
        )
    }
}
