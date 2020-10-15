
solution {
    puzzle = "P015"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = 4 to -3
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                wait(4)
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                wait(7)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
                wait(1)
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                extend()
                drop()
                retract()
                reset()
            }
        }
        )
    }
}
