
solution {
    puzzle = "P065"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 14 to -10
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 15 to -12
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 15 to -13
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 11 to -13
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 10 to -13
        rotation = -6
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 14 to -14
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 14 to -13
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 11 to -12
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 12 to -8
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 13 to -8
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 1 to 2
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 11 to -8
        rotation = -1
    }
    glyph(BONDER) {
        position = 12 to -10
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 11 to -10
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 12 to -12
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 9 to -8
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to -9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 14 to -12
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 13 to -13
        rotation = 0
    }
    track {
        position = 9 to -10
        positions = listOf(1 to -3, 1 to -2, 2 to -3)
    }
    track {
        position = -4 to 6
        positions = listOf(5 to -4, 4 to -3)
    }
    track {
        position = 14 to -9
        positions = listOf(1 to -3, 0 to -2, 0 to -1, 0 to 0, 0 to 1, 1 to 1)
    }
    track {
        position = 14 to -11
        positions = listOf(-5 to 6, -4 to 5, -3 to 4, -2 to 3, -1 to 3, -2 to 4, -1 to 4, 0 to 4, 1 to 4, 1 to 5, 0 to 6, -1 to 6, -2 to 6, -3 to 6, -4 to 6)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
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
            sequence(8) {
                wait(5)
                grab()
                extend()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
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
            sequence(5) {
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(9)
                repeat()
                wait(19)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
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
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                wait(7)
                reset()
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(52)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                rotateClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                forward()
                wait(1)
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
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
                forward()
                reset()
                wait(1)
                grab()
                extend()
                forward()
                drop()
                back()
                reset()
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
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                wait(8)
                grab()
                forward()
                drop()
                back()
                wait(6)
                grab()
                forward()
                drop()
                back()
                wait(6)
                grab()
                forward()
                drop()
                back()
                wait(8)
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(16)
                grab()
                back()
                back()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                grab()
                back()
                back()
                forward()
                back()
                back()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                wait(2)
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
