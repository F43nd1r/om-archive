
solution {
    puzzle = "P063"
    name = "B CG 2T"
    arm(ARM1) {
        number = 1
        position = -1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -6 to 6
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to 5
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to 5
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 0 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -4 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -1 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 3 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 2 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 3
        rotation = 0
    }
    track {
        position = 3 to -5
        positions = listOf(0 to -1, 0 to 0, 0 to 1, -1 to 2)
    }
    track {
        position = -2 to -4
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to -1, 1 to -1, 1 to 0, 2 to 0, 3 to 0)
    }
    track {
        position = -4 to 4
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = 0 to 4
        positions = listOf(-1 to 1, 0 to 1, 0 to 0)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = -2 to 4
        positions = listOf(-1 to 1, 0 to 1, 0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = -4 to 2
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                wait(2)
                pivotCounterClockwise()
                forward()
                reset()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                back()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(17) {
                wait(6)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                wait(1)
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                back()
                grab()
                back()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                back()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                forward()
                forward()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                extend()
                back()
                wait(1)
                pivotCounterClockwise()
                back()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
                retract()
                back()
                back()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
                wait(4)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                back()
                wait(3)
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(6)
                grab()
                pivotClockwise()
                pivotClockwise()
                forward()
                wait(2)
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        )
    }
}
