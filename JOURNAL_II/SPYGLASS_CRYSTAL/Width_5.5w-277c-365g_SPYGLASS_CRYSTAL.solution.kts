
solution {
    puzzle = "P063"
    name = "WIDTH"
    arm(PISTON) {
        number = 1
        position = 3 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to 1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -2 to -2
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 2 to -4
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 7 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 7 to 7
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 6
        rotation = -1
    }
    glyph(BONDER) {
        position = 8 to 4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 4 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(-1 to 0, 0 to 0)
    }
    track {
        position = 4 to -2
        positions = listOf(-1 to 0, -1 to 1, 0 to 0)
    }
    track {
        position = 6 to 1
        positions = listOf(1 to 1, 2 to 1, 2 to 2, 3 to 2, 3 to 3, 4 to 3)
    }
    track {
        position = 7 to 7
        positions = listOf(1 to 0, 0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = 0 to -4
        positions = listOf(2 to 0, 1 to 1, 2 to 1, 3 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                retract()
                wait(1)
                extend()
                extend()
                reset()
                wait(1)
                retract()
                forward()
                grab()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                forward()
                drop()
                retract()
                grab()
                rotateClockwise()
                extend()
                forward()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                back()
                wait(3)
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(22)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(43)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(44)
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                wait(1)
                back()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
