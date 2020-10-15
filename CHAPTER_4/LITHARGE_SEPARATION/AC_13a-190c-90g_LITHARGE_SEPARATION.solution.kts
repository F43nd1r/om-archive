
solution {
    puzzle = "P031b"
    name = "B X ACX"
    arm(PISTON) {
        number = 1
        position = -3 to -1
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                retract()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                extend()
                retract()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
